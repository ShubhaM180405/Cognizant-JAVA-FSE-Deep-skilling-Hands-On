import React, { useState } from "react";

function CurrencyConvertor() {

    const [amount, setAmount] = useState("");
    const [currency, setCurrency] = useState("");

    const handleSubmit = () => {

        if (currency.toLowerCase() === "euro") {

            const result = (amount * 0.0091).toFixed(4);

            alert("Coverting to Euro Amount is : " + result);

        } else {

            alert("Please enter Currency as Euro");

        }

    };

    return (

        <div>

            <h1 style={{color:"green"}}>Currency Convertor!!!</h1>

            <label>Amount:&nbsp;&nbsp;</label>

            <input
                type="number"
                value={amount}
                onChange={(e)=>setAmount(e.target.value)}
            />

            <br/><br/>

            <label>Currency:&nbsp;</label>

            <input
                type="text"
                value={currency}
                onChange={(e)=>setCurrency(e.target.value)}
            />

            <br/><br/>

            <button onClick={handleSubmit}>
                Submit
            </button>

        </div>

    );

}

export default CurrencyConvertor;