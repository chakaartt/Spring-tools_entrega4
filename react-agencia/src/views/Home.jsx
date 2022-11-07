import React, { useState, useEffect } from "react";
import axios from "axios";

export default function Home() {
  const [clientes, setClientes] = useState([]);

  const listaClientes = async () => {
    try {
      await axios.get("http://localhost:8080/api/cliente").then((Response) => {
        setClientes(Response.data);
      });
    } catch (erro) {
      alert(erro.message);
    }
  };

  useEffect(() => {
    listaClientes();
  }, []);

  return (
    <div className="container">
      <div className="py-4">
        <table className="table table-striped borde shadow">
          <thead>
            <tr>
              <th scope="col">#</th>
              <th scope="col">nome</th>
              <th scope="col">email</th>
              <th scope="col">Handle</th>
              <th scope="col">*</th>
            </tr>
          </thead>
          <tbody>
            {clientes.map((cliente, key) => (
              <tr>
                <th scope="row" key={key} >{key + 1}</th>
                <td>{cliente.nome_cliente}</td>
                <td>{cliente.email_cliente}</td>
                <td>{cliente.senha_cliente}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
}
