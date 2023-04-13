/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author patoe
 */

@Controller
@RequestMapping(value="/validacion.htm")
public class SumaController 
{
    @RequestMapping(method = RequestMethod.POST)
    public String Validacion(@RequestParam("num1") String str1, @RequestParam("num2") String str2, Model modelo)
    {
        try
        {
            Float numero1 = Float.parseFloat(str1);
            Float numero2 = Float.parseFloat(str2);
            
            Float resultado = numero1 + numero2;
            
            modelo.addAttribute("flt1", numero1);
            modelo.addAttribute("flt2", numero2);
            modelo.addAttribute("resultadoValor",resultado);
            
            return "resultado";
        }
        
        catch(NullPointerException a)
        {
            modelo.addAttribute("mensajeError","Faltaron datos por ingresarse");
            return "error";
        }
        
        catch(NumberFormatException b)
        {
            modelo.addAttribute("mensajeError","Alguno de los valores ingresados no pudo convertirse a una variable de tipo Float");
            return "error";
        }
    }
}
