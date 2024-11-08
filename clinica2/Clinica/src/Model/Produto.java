/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Control.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Produto {
    private int codigo;
    private String nome;
    private String endereco;
    private String complemento;
    private String RG;
    private String CPF;
    private String data_nascimento;
    
    Conexao con = new Conexao();
    
        public Produto() {
        this(0, "", "", "", "", "", "");
    }

    public Produto(int codigo, String nome, String endereco, String complemento, String RG, String CPF, String data_nascimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.complemento = complemento;
        this.RG = RG;
        this.CPF = CPF;
        this.data_nascimento = data_nascimento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public Conexao getCon() {
        return con;
    }

    public void setCon(Conexao con) {
        this.con = con;
    }
    
            public void cadastrarProduto() {
        String sql;
        sql = "INSERT INTO produtos (codigo, nome, endereco, complemento, RG, CPF, data_nascimento) VALUES "
                + "(" + getCodigo() + ",'" + getCodigo() + "','" + getNome() + "','" + getEndereco() + "','" + getRG() + "','" + getCPF() + "','" + getData_nascimento() + "')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");
    }
        public ResultSet consultarProdutos() {
        ResultSet tabela;
        tabela = null;

        String sql = "Select * from clientes";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
        
            public void excluirProduto() {
        String sql;
        sql = "Delete from clientes where codigo=" + getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluido com sucesso...");
    }
            
        public void alterarProduto() {
        String sql;
        sql = "Update clientes set nome='" + getNome() + "',endereco='" + getEndereco()+ "',complemento='" + getComplemento()+ "',RG='" + getRG()+ "',CPF='" + getCPF()+ "',data_nascimento='" + getData_nascimento()+ "' where codigo=" + getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso...");
    }
}


