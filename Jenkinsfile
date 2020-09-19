pipeline {
    agent any

        environment {
            URL1 = 'google.com'
        }

    stages {

        stage ('My First Stage') {
            environment {
                        URL2 = 'yahoo.com'
                    }
            steps {
                sh '''
                  echo Hello from First Stage
                  ls
                  echo Bye from First Stage
                '''
                print "Hello Groovy"
                print "URL1 = " + URL1
                print "URL2 = " + URL2
            }
        }

    }
}