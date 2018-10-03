import React, { Component } from 'react';
import './Login.css';
import { GOOGLE_AUTH_URL, FACEBOOK_AUTH_URL, GITHUB_AUTH_URL } from '../../constants';

class Login extends Component {
    render() {
        return (
            <div className="container login-container">
                <h1 className="page-title">Login</h1>
                <div className="login-content">
                    <SocialLogin />
                    <div className="or-separator">
                        <span className="or-text">OR</span>
                    </div>
                    <LoginForm />
                </div>
            </div>
        );
    }
}

class SocialLogin extends Component {
    render() {
        console.log(GOOGLE_AUTH_URL);
        return (
            <div className="social-login">
                <a className="btn social-btn google" href={GOOGLE_AUTH_URL}>Log in with Google</a>
                <a className="btn social-btn facebook" href={FACEBOOK_AUTH_URL}>Log in with Facebook</a>
                <a className="btn social-btn github" href={GITHUB_AUTH_URL}>Log in with Github</a>
            </div>
        );
    }
}


class LoginForm extends Component {
    constructor(props) {
        super(props);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleSubmit(event) {
        event.preventDefault();   
        this.props.form.validateFields((err, values) => {
            if (!err) {
                
            }
        });
    }

    render() {
        return (
            <form>

            </form>                    
        );
    }
}

export default Login