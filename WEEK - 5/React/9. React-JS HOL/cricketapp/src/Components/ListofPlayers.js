import React from "react";

function ListofPlayers({ players }) {

    return (

        <ul>

            {

                players.map((item,index)=>(

                    <li key={index}>
                        Mr. {item.name} &nbsp;&nbsp; {item.score}
                    </li>

                ))

            }

        </ul>

    );

}

export default ListofPlayers;