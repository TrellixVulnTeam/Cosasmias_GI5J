//console.log('Hola Mundo')

// Tipos de datos en JS
// String: cadena de caracteres. 'a' 'Hola mundo' 'hola mundo maravilloso' "a" "hola mundo"
// Boolean: true/false.
// Null: nulo. Es una variable pefinida pero vale 0.
// Number: 1211321312 1 12 123. "123"!=123
// Underfined. Valor sin definir.
// Object. Puede tener cualquier combinacion de esos tipos de datos. Son estructura que agrupan.

// Definicion de variables
// var va al tope del archivo para definirla
// let
// const

let miPrimeraVariable='Mi primera variable!'
//console.log(miPrimeraVariable);

// Mutabilidad: capacidad de cambiar de valores.
miPrimeraVariable ='Esto ha cambiado'
//console.log(miPrimeraVariable);

// Boolean
let miBoolean = true;
let miOtroBoolean = false;

let miNumero = 0
let miNumero2 = 12
let miNumero3 = -258

//console.log(miNumero, miNumero2, miNumero3, miBoolean, miPrimeraVariable);

let undef 
//console.log(undef);

let nulo = null
//console.log(nulo);

// objeto: es una agrupacion de datos que tienen relacion entre si. No tienen variables si no propiedades

// Objeto vacio
const miPrimerObjeto = {}

// Objeto
const miObjeto = {
    unNumero: 12,
    unString: 'Esta cadena de caracteres',
    unaCondicion: true,
}

//console.log(miObjeto.unString);

const arrVacio = []
const arr = [1, 2, 'Hola', 'Mundo', miObjeto]

//console.log(arrVacio, arr);

arrVacio.push(5)
arrVacio.push(3)
arrVacio.push(1)
arrVacio.push('Hola')
arrVacio.push(miPrimeraVariable)

//console.log(arrVacio);

/*
const suma = 1 + 2
const resta = 1 - 2
const multiplicar = 2 * 3
const division = 9 / 3
*/

//console.log(suma, resta, multiplicar, division);

const modulo = 10 % 3
//console.log(modulo);

let num = 5
//const vs let no deja cambiar variables u objetos (si sus propiedades)
//num++
//num--
//num--



//operador de asignacion

num += 5
num -= 5
num *= 5
num /= 2

//console.log(num);

// operadores comparación: devuelven boolean
// === comparacion estricta 5 === '5' false
// == compara distintas variables 5 num == '5' string true
const resultado1 = 5 === 6
const resultado2 = 5 == '5'
const resultado3 = 5 < 6
const resultado4 = 5 < 5
const resultado5 = 5 > 6
const resultado6 = 5 > 4
const resultado7 = 5 <= 5
const resultado8 = 5 <= 6
const resultado9 = 5 >= 5
const resultado10 = 5 >= 6

const resultado11 = 5 !== 6
const resultado12 = 5 != '5'

//console.log(resultado11, resultado12);

// operadores lógicos: or ||, and &&, not !

// or: siempre buscará dar el true y deja de evaluar cuando lo encuentra
// Strings numeros y objetos son true excepto 0
const resultadoOr =  false || false || 'Hola' || 'Mundo'
//console.log(resultadoOr);

// and: busca el primer false, es encadenable tambien
const resultadoAnd = true && false && true
//console.log(resultadoAnd);

//not: da el valor opuesto

const resultadoNot = !false
//console.log(resultadoNot);



// Control de flujo!

// if
 const edad = 4
/* if (edad > 5 && edad < 18) {
    console.log('estoy dentro de un if');

} else {
    console.log('El niño no puede jugar :(');
}*/
// while

/*let x = true
while (x) {
    console.log(x);
    x = false;
}
*/
// switch
// Se pone siempre el break;

/*let y = false;
switch (y) {
    case 1: {
        console.log('yo soy el caso 1');
        break;
    }
    case true:{
        console.log('yo soy el caso 2');
        break;
    }
    case false:
        console.log('yo soy el caso 3');
        break;
    default:
        console.log('yo soy el caso default');
        break;
}   
*/

// for 

/*for (let i = 0; i < 10; i++) {
    console.log(i);
}
*/
/*
const numeros = [1, 2, "Hola", 4, 5]

for (let i = 0; i < numeros.length; i++) {
    console.log(numeros[i]);
}

function iterar(arg1) {
    for (let i = 0; i < arg1.length; i++) {
        console.log(arg1[i]);
    }    
}

const numeros = [1, 2, "Hola", 4, 5]
const nombres = ['Pedro', 'Juan', "Felipe", 'Toni', 'Fer']
iterar(numeros)
iterar(nombres)
*/
/*
function suma(a, b) {
    return a + b;
}

const resultadoSuma1 = suma(1,2) //3
const resultadoSuma2 = suma(5,6) //11
const resultadoSuma3 = suma(resultadoSuma1, resultadoSuma2) //14
console.log('resultado', resultadoSuma3);
*/


function sumar(a, b, cb) {
    const r = a + b
    cb(r)
}

function callback(result) {
    console.log('resultado', result)
}

//callback(6)
//sumar(2, 3, callback)


// fat arrow function


const miFatArrowFunction = (a, b) => a + b
const otraFAF = (a, b) => {
    return a + b
}
const r = otraFAF(4,6)
//console.log(r);


sumar(2, 3 , function (r) {
    console.log('soy una funcion anonima y mi resultado es', r)
})