pipeline {
    agent any

    environment {
        DOCKER_REGISTRY = 'docker.io'  // Docker Hub
        DOCKER_IMAGE_NAME = 'your-docker-username/your-spring-app'
        DOCKER_IMAGE_TAG = 'latest'
    }

    stages {
        stage('Checkout') {
            steps {
                script {
                    git 'https://github.com/tsega19/crud.git'
                }
            }
        }

        stage('Build') {
            steps {
                script {
                    sh './gradlew clean build'
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    sh "docker build -t $DOCKER_REGISTRY/$DOCKER_IMAGE_NAME:$DOCKER_IMAGE_TAG ."
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                script {
                    sh "docker push $DOCKER_REGISTRY/$DOCKER_IMAGE_NAME:$DOCKER_IMAGE_TAG"
                }
            }
        }

        stage('Deploy with Docker Compose') {
            steps {
                script {
                    writeFile file: 'docker-compose.yml', text: """
                        version: '3'
                        services:
                          app:
                            image: $DOCKER_REGISTRY/$DOCKER_IMAGE_NAME:$DOCKER_IMAGE_TAG
                            ports:
                              - "8080:8080"
                    """
                    sh 'docker-compose up -d'
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
            echo 'Build and deployment successful!'
        }

        failure {
            echo 'Build or deployment failed!'
        }
    }
}
