import "./App.css";

import React,{Component} from "react";

import CurrencyConvertor from "./Components/CurrencyConvertor";

class App extends Component{

constructor(){

super();

this.state={

count:0

};

}

increment=()=>{

this.setState({

count:this.state.count+1

});

}

decrement=()=>{

this.setState({

count:this.state.count-1

});

}

sayHello=()=>{

alert("Hello! Member Welcome to React Events.");

}

increase=()=>{

this.increment();

this.sayHello();

}

sayWelcome=(msg)=>{

alert(msg);

}

onPress=()=>{

alert("I was clicked");

}

render(){

return(

<div className="container">

<h1>Counter : {this.state.count}</h1>

<button onClick={this.increase}>
Increment
</button>

<br/><br/>

<button onClick={this.decrement}>
Decrement
</button>

<br/><br/>

<button onClick={()=>this.sayWelcome("Welcome")}>
Say Welcome
</button>

<br/><br/>

<button onClick={this.onPress}>
Click On Me
</button>

<hr/>

<CurrencyConvertor/>

</div>

);

}

}

export default App;