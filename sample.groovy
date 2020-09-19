def PROJECT_NAME = 'roboshop'
def CIJOBS = 'CIJOBS'
def GIT_PREFIX = 'https://github.com/amit7chauhan'

folder(PROJECT_NAME) {
    displayName(PROJECT_NAME)
    description(PROJECT_NAME + 'Project folder')
}

folder(PROJECT_NAME + '/' + CIJOBS ) {
    displayName(CIJOBS)
    description(PROJECT_NAME + 'Project' + CIJOBS + 'folder')
}



pipelineJob(PROJECT_NAME + '/' +CIJOBS+ "/sample") {
    description('sample')
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url(GIT_PREFIX+"/jenkins-seed-jobs.git")
                                           }
                    branch("*/master")
                }
            }
            scriptPath("Jenkinsfile")
        }
    }
}