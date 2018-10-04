import React, { Component } from 'react';
import { Link } from 'react-router-dom';
import './AppHeader.css';

class AppHeader extends Component {
    constructor(props) {
        super(props);
    }

    render() {
        return (
            <header className="app-header">
                <div className="container">
                    <div className="app-branding">
                        <Link to="/" className="app-title">Spring Social</Link>
                    </div>
                    <div className="app-options">
                        <a className="btn" onClick={this.props.onLogout}>Logout</a>
                    </div>
                </div>
            </header>
        )
    }
}

export default AppHeader;