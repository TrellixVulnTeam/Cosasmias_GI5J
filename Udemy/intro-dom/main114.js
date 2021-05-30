const todos = JSON.parse(localStorage.getItem('todos')) || [];

const render = () => {
    const todoList = document.getElementById('todo-list');
    const todosTemplate = todos.map(t => '<li>' + t + '</li>');
    todoList.innerHTML = todosTemplate.join('');
    const elementos = document.querySelectorAll('#todo-list li')
    elementos.forEach((elemento, i) => {
        elemento.addEventListener('click', () => {
            elemento.parentNode.removeChild(elemento)
            todos.splice(i, 1)
            actualizaTodos(todos)
            render()
        })
    })
}

const actualizaTodos = (todos) => {
            const todoStrings = JSON.stringify(todos)
        localStorage.setItem('todos', todoStrings)
}
window.onload = () => {
    render()
    const form = document.getElementById('todo-form');
    form.onsubmit = (e) => {
        e.preventDefault();
        const todo = document.getElementById('todo');
        const todoText = todo.value;
        todo.value = '';
        todos.push(todoText);
        actualizaTodos(todos )
        render()
    }
}

/* window.onload es una funcion que hace que haya que esperar a que se cargue la pagina para cergar el JS
el const.innerText = '' te permite cambiar el texto de lo que elijas
el const.innerHTML = '' te permite agregar HTML o etiquetas
.map te permite iterar o hacer una función en cada elemento de un array
.join une a los elementos de un array
.splice(numero del indice del array, cuantos elem a partir de el)
*/
