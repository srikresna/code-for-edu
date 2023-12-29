# Building URL Dynamically
# variable rules and URL building

from flask import Flask, redirect, url_for

app = Flask(__name__)


@app.route('/')
def welcome():
    return 'Welcome to Flask'

@app.route('/success/<int:score>')
def success(score):
    return '<html><body><h1>The person has passed and the marks is {}</h1></body></html>'.format(score)

@app.route('/fail/<int:score>')
def fail(score):
    return '<html><body><h1>The person has failed and the marks is {}</h1></body></html>'.format(score)

### result checker
@app.route('/results/<int:marks>')
def results(marks):
    result = ''
    if marks < 50:
        result = 'fail'
    else: 
        result = 'success'
    return redirect(url_for(result, score=marks))

if __name__ == '__main__':
    app.run(debug=True)