var http = require('http');
var fs = require('fs');

http
  .createServer((request, response) => {
    var url = request.url;

    if (url === '/') {
      url = '/index.html';
    }
    if (url === '/favicon.ico') {
      return response.writeHead(404);
    }

    response.writeHead(200);
    response.end(fs.readFileSync(__dirname + url));
  })
  .listen(3000);
