package com.example.ac1.services;

import java.util.ArrayList;
import com.example.ac1.model.Produto;
import com.example.ac1.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * ProdutoServices
 */
@Service
public class ProdutoServices {
    @Autowired
    private ProdutoRepository ServRepo;
    public ArrayList<Produto> getProdutosMaior(double prec){
        ArrayList<Produto> ret = new ArrayList<Produto>();
        ArrayList<Produto> ter = new ArrayList<Produto>();
        ter = ServRepo.getProdutos();
        for (Produto produto : ter) {
            if(produto.getValor()>prec)
            {
                ret.add(produto);
            }
        }
        return ret;
    }
    public Produto getByID(int id){
        ArrayList<Produto> ret = ServRepo.getProdutos();
        for(Produto produto : ret)
        {
            if(produto.getCodigo() == id)
            {
                return produto;
            }
        }
        return null;
    }
    public ArrayList<Produto> getProdutosMenor(double prec){
        ArrayList<Produto> ret = new ArrayList<Produto>();
        ArrayList<Produto> ter = new ArrayList<Produto>();
        ter = ServRepo.getProdutos();
        for (Produto produto : ter) {
            if(produto.getValor()<prec)
            {
                ret.add(produto);
            }
        }
        return ret;
    }
    public ArrayList<Produto> getProdutosEstoque(){
        ArrayList<Produto> ret = new ArrayList<Produto>();
        ArrayList<Produto> ter = new ArrayList<Produto>();
        ter = ServRepo.getProdutos();
        for (Produto produto : ter) {
            if(produto.getEstoque()>0)
            {
                ret.add(produto);
            }
        }
        return ret;
    }
    /**
    getProduto(int id): devolve o produto e se não existir devolve uma mensagem de erro que deve ser apresentado em uma view.
    --------------------Todos recebendo em arrayList Trocando ideia com o ProdutoRepository
    getProdutosEmEstoque(): Devolve somente os produtos em estoque.
    getProdutosByValorAcima(double valor): Devolve todos os produtos acima do valor passado.
    getProdutosByValorAbaixo(double valor): Devolve todos os produtos abaixo de um valor passado.
    */
}