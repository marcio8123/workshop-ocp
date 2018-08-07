kind: "BuildConfig"
apiVersion: "v1"
metadata:
  name: "workshop-pipeline"
  annotations:
    pipeline.alpha.openshift.io/uses: '[{"name": "xpt", "kind": "DeploymentConfig"}]'
spec:
  source:
    type: "Git"
    git:
      uri: "http://github.com/marcio8123/workshop-ocp.git"
  strategy:
    type: "JenkinsPipeline"
    jenkinsPipelineStrategy:
      jenkinsfilePath: "jenkins-pipeline.groovy"
