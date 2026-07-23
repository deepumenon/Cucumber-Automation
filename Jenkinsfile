pipeline {
    agent any

    tools {
        // These names MUST match the tool names in your Jenkins Global Tool Configuration
        maven 'Maven 3.x'
        jdk 'JDK 17'
    }

    stages {
        stage('Checkout Code') {
            steps {
                echo 'Fetching latest code from GitHub...'
                checkout scm
            }
        }

        stage('Compile') {
            steps {
                echo 'Compiling Java classes...'
                bat 'mvn clean compile' // Use 'sh' if running Jenkins on Mac/Linux
            }
        }

        stage('Run Cucumber Tests') {
            steps {
                echo 'Executing Cucumber Automation Tests...'
                bat 'mvn test'
            }
        }
    }

    post {
        always {
            // Generates the HTML report on Jenkins
            cucumber buildStatus: 'UNSTABLE', 
                     fileIncludePattern: '**/cucumber.json', 
                     jsonReportDirectory: 'target'
        }
    }
}