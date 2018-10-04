import React, { Component } from 'react';
import oAuth2Logo from '../img/oauth2-logo.png';
import './Home.css';

class Home extends Component {
    render() {
        return (
            <div className="home-container">
                <div className="container">
                    <img src={oAuth2Logo} height={300} />
                    <h1>Spring Boot React OAuth2 Social Login Demo</h1>
                </div>
            </div>
        )
    }
}

export default Home;