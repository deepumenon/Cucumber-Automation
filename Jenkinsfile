pipeline {
    agent any

    tools {
        maven 'Maven 3.x'
        jdk 'JDK 21' // Match your JDK version configured in Jenkins Tools
    }

    stages {
        stage('Checkout Code') {
            steps {
                echo 'Pulling code from GitHub...'
                checkout scm
            }
        }

        stage('Compile') {
            steps {
                echo 'Compiling Java classes...'
                bat 'mvn clean compile'
            }
        }

        stage('Run Cucumber Tests') {
            steps {
                echo 'Running Cucumber Test Suite...'
                bat 'mvn test'
            }
        }
    }

    post {
        always {
            // Generate visual Cucumber HTML report
            cucumber buildStatus: 'UNSTABLE', 
                     fileIncludePattern: '**/*.json', 
                     jsonReportDirectory: 'target'
        }
        failure {
            // Send email notification on failure
            emailext body: """
                <p><strong>ALERT:</strong> Jenkins Build Failed!</p>
                <p>Project: ${env.JOB_NAME}</p>
                <p>Build Number: #${env.BUILD_NUMBER}</p>
                <p>URL: <a href="${env.BUILD_URL}">${env.BUILD_URL}</a></p>
                """,
                subject: "FAILED: Job '${env.JOB_NAME}' [Build #${env.BUILD_NUMBER}]",
                to: "neopappu114@gmail.com" // Replace with your email address
        }
    }
}