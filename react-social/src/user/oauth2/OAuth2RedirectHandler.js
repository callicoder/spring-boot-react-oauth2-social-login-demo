import React, { Component } from 'react';
import { ACCESS_TOKEN } from '../../constants';

class OAuth2RedirectHandler extends Component {
    constructor(props) {
        super(props);
    }

    getUrlParameter(name) {
        name = name.replace(/[\[]/, '\\[').replace(/[\]]/, '\\]');
        var regex = new RegExp('[\\?&]' + name + '=([^&#]*)');

        var results = regex.exec(this.props.location.search);
        return results === null ? '' : decodeURIComponent(results[1].replace(/\+/g, ' '));
    };

    render() {        
        const token = this.getUrlParameter('token');
        const error = this.getUrlParameter('error');

        if(token) {
            localStorage.setItem(ACCESS_TOKEN, token);
            this.props.history.push("/");
        } else {
            this.props.history.push("/login");
        }
        
        return (
            <div>
                Logging you in...        
            </div>
        );
    }
}

export default OAuth2RedirectHandler;