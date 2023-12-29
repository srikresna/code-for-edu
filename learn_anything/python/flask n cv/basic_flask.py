from flask import Flask
### WSGI Application
app = Flask(__name__)

@app.route('/')
def welcome():
    return 'Welcome to my website! HAHAHAHA LOL'

@app.route('/about')
def about():
    return 'About me'


if __name__ == '__main__':
    app.run(debug=True)