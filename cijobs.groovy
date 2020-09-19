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



pipelineJob(PROJECT_NAME + '/' +CIJOBS+ "/cart") {
    description('cart')
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url(GIT_PREFIX+"/rs-cart")
                                           }
                    branch("*/master")
                }
            }
            scriptPath("Jenkinsfile")
        }
    }
}


pipelineJob(PROJECT_NAME + '/' +CIJOBS+ "/catalogue") {
    description('catalogue')
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url(GIT_PREFIX+"/rs-catalogue")
                    }
                    branch("*/master")
                }
            }
            scriptPath("Jenkinsfile")
        }
    }
}


pipelineJob(PROJECT_NAME + '/' +CIJOBS+ "/user") {
    description('user')
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url(GIT_PREFIX+"/rs-user")
                    }
                    branch("*/master")
                }
            }
            scriptPath("Jenkinsfile")
        }
    }
}