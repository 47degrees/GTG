# Google Token Generator

Steps:
- Place your JSON credentials in `.direnv/google-credentials.json`
- Set the env var: 
```
export GOOGLE_APPLICATION_CREDENTIALS='.direnv/google-credentials.json'
```
- Run the app, passing the audience as argument:
```
sbt "run https://myNameSpace.cloudfunctions.net/my-cloud-function"
```