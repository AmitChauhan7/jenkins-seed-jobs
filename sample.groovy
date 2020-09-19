def PROJECT_NAME = 'roboshop'
def CIJOBS = 'CIJOBS'

folder(PROJECT_NAME) {
    displayName(PROJECT_NAME)
    description(PROJECT_NAME + 'Project folder')
}

folder(PROJECT_NAME + '/' + CIJOBS ) {
    displayName(CIJOBS)
    description(PROJECT_NAME + 'Project' + CIJOBS + 'folder')
}



pipelineJob(PROJECT_NAME + '/' +CIJOBS+ "/sample") {
    description('roboshop')
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url("https://github.com/amit7chauhan/jenkins-seed-jobs.git")
                                           }
                    branch("*/master")
                }
            }
            scriptPath("Jenkinsfile")
        }
    }
}