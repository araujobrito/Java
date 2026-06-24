package Service;

import domain.cliente.CadastroClienteDTO;
import domain.cliente.ClienteRepository;
import domain.cliente.ClienteResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public ClienteResponseDTO cadastrar(CadastroClienteDTO dto) {

        var cliente = new com.aula.api.domain.cliente.Cliente(
                dto.razaoSocial(),
                dto.cnpj(),
                dto.nomeResponsavel(),
                dto.email(),
                dto.senha(),
                dto.telefone()
        );

        repository.save(cliente);
        return new ClienteResponseDTO(cliente);
    }
    // Listar todos os clientes
    public List<ClienteResponseDTO> listar() {
        return repository.findAll()
                .stream()
                .map(ClienteResponseDTO::new)
                .toList();
    }

}