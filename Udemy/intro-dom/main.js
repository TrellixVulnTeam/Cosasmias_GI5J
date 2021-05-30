const todos = [];

window.onload = () => {
    const form = document.getElementById('todo-form');
    form.onsubmit = (e) => {
        e.preventDefault();
        const todo = document.getElementById('todo');
        const todoText = todo.value;    
        todo.value = '';
        todos.push(todoText);
        const todolist = document.getElementById('todo-list');
        todolist.innerHTML = '';
        for(let i = 0; i < todos.length; i++) {
            todolist.innerHTML +='<li>' + todos[i] + '</li>'
        }
    }
}

/* window.onload es una funcion que hace que haya que esperar a que se cargue la pagina para cergar el JS
el const.innerText = '' te permite cambiar el texto de lo que elijas
el const.innerHTML = '' te permite agregar HTML o etiquetas
*/
