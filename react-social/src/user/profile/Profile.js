import React, { Component } from 'react';
import './Profile.css';
import AppHeader from '../../common/AppHeader';

class Profile extends Component {
    render() {
        return (
            <div className="app-container">
                <AppHeader />
                <div className="profile-container">
                    <div className="container">
                        <h1 className="page-title">Profile</h1>
                        <div className="profile-content">

                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

export default Profile