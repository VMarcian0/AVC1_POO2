package com.example.ac1.model;

import java.util.Objects;

/**
 * Produto
 */
public class Produto {
//modelo é o meu objeto
    private int codigo;
    private String nome;
    private double valor;
    private int estoque;

    public Produto(int codigo, String nome, double valor, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return this.estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public Produto codigo(int codigo) {
        this.codigo = codigo;
        return this;
    }

    public Produto nome(String nome) {
        this.nome = nome;
        return this;
    }

    public Produto valor(double valor) {
        this.valor = valor;
        return this;
    }

    public Produto estoque(int estoque) {
        this.estoque = estoque;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Produto)) {
            return false;
        }
        Produto produto = (Produto) o;
        return codigo == produto.codigo && Objects.equals(nome, produto.nome) && valor == produto.valor && estoque == produto.estoque;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nome, valor, estoque);
    }

    @Override
    public String toString() {
        return "{" +
            " codigo='" + getCodigo() + "'" +
            ", nome='" + getNome() + "'" +
            ", valor='" + getValor() + "'" +
            ", estoque='" + getEstoque() + "'" +
            "}";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(final int codigo) {
        this.codigo = codigo;
    }

}