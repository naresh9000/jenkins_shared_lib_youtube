def call() {
    withSonarQubeEnv('sonar') {
        sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=youtube -Dsonar.projectKey=youtube '''
    }
}