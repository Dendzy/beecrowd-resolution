var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var numero = parseInt(lines.shift());
var quant_horas_trabalhadas = parseInt(lines.shift());
var valor_funcionario_hora = parseFloat(lines.shift());

var salario = quant_horas_trabalhadas * valor_funcionario_hora;

console.log("NUMBER = " + numero);
console.log("SALARY = U$ " + salario.toFixed(2));
