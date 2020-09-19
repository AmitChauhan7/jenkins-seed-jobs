pipeline {
    agent any
    stages {

        environment {
            URL = 'google.com'
        }

        stage ('My First Stage') {
            steps {
                sh '''
                  echo Hello from First Stage
                  ls
                  echo Bye from First Stage
                '''
                print "Hello Groovy"
                print "URL = " + URL
            }
        }

    }
}