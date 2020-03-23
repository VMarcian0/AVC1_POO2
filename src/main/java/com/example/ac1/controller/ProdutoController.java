package com.example.ac1.controller;
import java.util.ArrayList;

import com.example.ac1.model.Produto;
import com.example.ac1.services.ProdutoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.bind.annotation.RequestParam;


/**
 * ProdutoController
 */
@Controller
public class ProdutoController {
    //vai chamar cada html
    @Autowired
    private ProdutoServices controllService;
    @GetMapping("/produto/{id}")
    public ModelAndView produtoId(@PathVariable int id){
        //chama service que chama model
        Produto x = controllService.getByID(id);//implementar
        ModelAndView mav;
        if(x == null)
        {
            mav = new ModelAndView("error");
            mav.addObject("error", x);
        }
        else
        {
            mav = new ModelAndView("produto");
            mav.addObject("Produto", x);
        }
        return mav;
    }
    @GetMapping("/produtosEmEstoque")
    public ModelAndView produtoEmEstoque(){
        ArrayList <Produto> produtos = controllService.getProdutosEstoque();
        ModelAndView mav;
        if(produtos.isEmpty())
        {
            mav = new ModelAndView("error");
            mav.addObject("error", produtos);
        }
        else{
            mav= new ModelAndView("produtosGrid");
            mav.addObject("produtos", produtos);
        }
        return mav;
    }
    @GetMapping("/produtosValorAcima/{val}")
    public ModelAndView produtosValorAcima(@PathVariable double val){
        ArrayList <Produto> produtos = controllService.getProdutosMaior(val);
        ModelAndView mav;
        //mav.addObject("produtos", produtos);
        if(produtos.isEmpty())
        {
            mav = new ModelAndView("error");
            mav.addObject("error", produtos);
        }
        else{
            mav= new ModelAndView("produtosGrid");
            mav.addObject("produtos", produtos);
        }
        return mav;
    }   
    @GetMapping("/produtosValorAbaixo/{val}")
    public ModelAndView produtosValorAbaixo(@PathVariable double val){
        ArrayList <Produto> produtos = controllService.getProdutosMenor(val);
        ModelAndView mav;
        if(produtos.isEmpty())
        {
            mav = new ModelAndView("error");
            mav.addObject("error", produtos);
        }
        else{
            mav= new ModelAndView("produtosGrid");
            mav.addObject("produtos", produtos);
        }
        //mav.addObject("produtos", produtos);
        return mav;
    }    
}