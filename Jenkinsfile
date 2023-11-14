pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                script {
                    // Clone the Git repository
                    git 'https://github.com/tsega19/crud.git'
                }
            }
        }

        stage('Build') {
            steps {
                script {
                    // Build and package the Spring Boot application using Gradle
                    sh './gradlew clean build'
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    // You can add deployment steps here if needed
                    // For example, deploying to a server or container
                    // You may need additional plugins for deployment steps
                }
            }
        }

        stage('Post-build Cleanup') {
            steps {
                script {
                    // Clean up after the build (if necessary)
                }
            }
        }
    }

    post {
        success {
            // Actions to perform if the pipeline is successful
            echo 'Build and deployment successful!'
        }

        failure {
            // Actions to perform if the pipeline fails
            echo 'Build or deployment failed!'
        }
    }
}
