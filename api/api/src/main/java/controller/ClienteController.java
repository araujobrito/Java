package controller;

import Service.ClienteService;
import domain.cliente.CadastroClienteDTO;
import domain.cliente.ClienteResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
@Tag(name = "Clientes", description = "Gerenciamento de clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @PostMapping("/cadastro")
    @Operation(summary = "Cadastrar cliente",
            description = "Cria um novo cliente no sistema")
    public ResponseEntity<ClienteResponseDTO> cadastrar(
            @RequestBody @Valid CadastroClienteDTO dto
    ) {

        var cliente = service.cadastrar(dto);
        return ResponseEntity.status(201).body(cliente);
    }

    // GET /api/clientes
    @GetMapping
    @Operation(summary = "Listar clientes",
            description = "Lista os clientes cadastrados no sistema")
    public ResponseEntity<List<ClienteResponseDTO>> listar() {
        return ResponseEntity.ok(service.listar());
    }
}