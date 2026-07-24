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
        mail to: 'deepakbabu513@gmail.com', // or whichever email you want to receive alerts
             subject: "BUILD FAILED: ${env.JOB_NAME} [Build #${env.BUILD_NUMBER}]",
             body: "Attention! The Jenkins job ${env.JOB_NAME} build #${env.BUILD_NUMBER} has failed.\nCheck details at: ${env.BUILD_URL}"
    }
    }
}