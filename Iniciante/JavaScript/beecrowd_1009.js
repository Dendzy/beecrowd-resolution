var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var nome = lines.shift();
var salario_fixo = parseFloat(lines.shift());
var montante_total = parseFloat(lines.shift());

var comissao = montante_total * 0.15;
var salario = comissao + salario_fixo;

console.log("TOTAL = R$ " + salario.toFixed(2));
