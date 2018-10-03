import React, { Component } from 'react';
import './Signup.css';
import { GOOGLE_AUTH_URL, FACEBOOK_AUTH_URL, GITHUB_AUTH_URL } from '../../constants';

class Signup extends Component {
    render() {
        return (
            <div className="container signup-container">
                <h1 className="page-title">Signup</h1>
                <div className="signup-content">
                    <SocialSignup />
                    <div className="or-separator">
                        <span className="or-text">OR</span>
                    </div>
                    <SignupForm />
                </div>
            </div>
        );
    }
}


class SocialSignup extends Component {
    render() {
        return (
            <div className="social-signup">
                <a className="btn social-btn google" href={GOOGLE_AUTH_URL}>Sign up with Google</a>
                <a className="btn social-btn facebook" href={FACEBOOK_AUTH_URL}>Sign up with Facebook</a>
                <a className="btn social-btn github" href={GITHUB_AUTH_URL}>Sign up with Github</a>
            </div>
        );
    }
}

class SignupForm extends Component {
    render() {
        return (
            <form>
                
            </form>
        );
    }
}

export default Signup