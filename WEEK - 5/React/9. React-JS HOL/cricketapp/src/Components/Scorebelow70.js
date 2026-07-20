import React from "react";

function Scorebelow70({ players }) {

    const players70 = players.filter(player => player.score <= 70);

    return (

        <ul>

            {

                players70.map((item,index)=>(

                    <li key={index}>
                        Mr. {item.name} &nbsp;&nbsp; {item.score}
                    </li>

                ))

            }

        </ul>

    );

}

export default Scorebelow70;