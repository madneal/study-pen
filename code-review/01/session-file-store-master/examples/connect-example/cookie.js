var crypto = require("crypto")

function generateCookie(sessionID, secret) {
    return sessionID + '.' + crypto
    .createHmac('sha256', secret)
    .update(sessionID)
    .digest('base64')
    .replace(/\=+$/, '');
}


const result = generateCookie("r22aK4lcpEcITWDfHp3sOsvBgZ1gewtZ", "keyboard cat");
console.log(result);