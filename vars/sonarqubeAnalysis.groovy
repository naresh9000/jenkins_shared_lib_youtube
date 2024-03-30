def call() {
    withSonarQubeEnv('sonar') {
    sh ''' $SCANNER_HOME \
        -Dsonar.projectKey=youtube \
        -Dsonar.sources=. \
        -Dsonar.host.url=http://ec2-3-234-177-208.compute-1.amazonaws.com:9000 \
        -Dsonar.login=squ_6c43bf967ebe25a07a8ac73b8e3729bfa5356941 '''   
    }
}