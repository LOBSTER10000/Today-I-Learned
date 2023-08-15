const http = require('http');

http
  .createServer(function (req, res) {
    const url = req.url;
    console.log(url, req.headers.cookie);
    res.writeHead(200, { 'Set-Cookie': 'my-cookie-test' });
    res.end('hello Cookie');
  })
  .listen(3000);
