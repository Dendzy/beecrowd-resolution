var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var codigo_peca1 = lines.shift().split(" ");
var peca1 = parseInt(codigo_peca1[0]);
var num_peca1 = parseInt(codigo_peca1[1]);
var valor_peca1 = parseFloat(codigo_peca1[2]);

var codigo_peca2 = lines.shift().split(" ");
var peca2 = parseInt(codigo_peca2[0]);
var num_peca2 = parseInt(codigo_peca2[1]);
var valor_peca2 = parseFloat(codigo_peca2[2]);

var valor_pago_peca1 = num_peca1 * valor_peca1;
var valor_pago_peca2 = num_peca2 * valor_peca2;
var valor_total = valor_pago_peca1 + valor_pago_peca2;

console.log("VALOR A PAGAR: R$ " + valor_total.toFixed(2));
