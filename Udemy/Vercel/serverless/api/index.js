const express = require('express')
const bodyParser = require('body-parser')
const mongoose =require('mongoose')
const cors = require('cors')

const meals = require('../api/routes/meals')
const orders = require('../api/routes/orders')
const app = express()
app.use(express.json())
app.use(express.urlencoded());
app.use(cors())


mongoose.connect(process.env.MONGO_URI, {useNewUrlParser: true, useUnifiedTopology: true})

/*const meals = app.router()

meals.get('/', (req,res) =>{

})

meals.post('/', (req,res) =>{

})*/

app.use('/api/meals', meals)
app.use('/api/orders', orders)

/*app.get('*', (req,res ) =>{
    res.send('Chanchito feliz')
})*/

module.exports = app