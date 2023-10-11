FROM node:16.0-alpine as build 

WORKDIR /app

COPY package.json package-lock.json ./

RUN npm install

COPY . ./

# Arguments
ARG REACT_APP_API_BASE_URL
ENV REACT_APP_API_BASE_URL=${REACT_APP_API_BASE_URL}


# Build the application
RUN npm run build

#### serve the react application from nginx 

FROM nginx:1.17.0-alpine

COPY --from=build /app/build /var/www

COPY nginx.conf /etc/nginx/nginx.conf

EXPOSE 80 

ENTRYPOINT [ "nginx", "-g", "daemon off;" ]

