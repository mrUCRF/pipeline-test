pipeline {
    agent any
    
    environment {
        PROJECT_NAME = "MYPROD FROM GIT"
        OWNER_NAME = "mrucrf"
    }

    stages {
        stage('Build from GIT') {
            steps {
               echo "2Start to step of building"
               echo "Building..."
               echo "Finished of  building step"
            }

            
        }
        stage('Test from GIT') {
            steps {
               echo "Start to step of test"
               echo "Testing..."
               echo "Hello ${OWNER_NAME}"
               echo "Your project is: ${PROJECT_NAME}"
               echo "Finished of test step"
            }
        }
        stage('Deploy from GIT') {
            steps {
               echo "Start to step of deploy"
               echo "Deployment..."
               sh '''
               echo "First text"
               echo "Second text"
               '''
               echo "Finished of deploy step"
            }

            
        }
    }
}
