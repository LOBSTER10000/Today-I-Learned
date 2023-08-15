let http = require('http');
let fs = require('fs');

http
  .createServer(function (request, response) {
    let url = request.url;
    try {
      if (url == '/') {
        url = '/index2.html';
      }
      response.writeHead(200);
      response.end(fs.readFileSync(__dirname + url));
    } catch (err) {
      console.error(err);
      response.writeHead(404);
      response.end(err.message);
    }
  })
  .listen(3000);
