/* uses sbt, which i installed with homebrew. */
/* this works without requiring the 'sbt plugin'. */

pipeline {
    agent any

    stages {

        stage('Compile') {
            steps {
                echo "Compiling..."
                sh "mvn compile"
            }
        }

        stage('Test') {
            steps {
                echo "Testing..."
                sh "mvn test"
            }
        }

        stage('Package') {
            steps {
                echo "Packaging..."
                sh "mvn package"
            }
        }

     /*   stage('Publish') {
            steps {
                echo "Packaging..."
                sh "sbt docker:publishLocal"
            }
        }
*/
    }
}
