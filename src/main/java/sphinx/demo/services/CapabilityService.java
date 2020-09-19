package sphinx.demo.services;

import org.springframework.stereotype.Service;
import sphinx.demo.domain.Capability;
import sphinx.demo.exceptions.CapabilityException;
import sphinx.demo.repositories.CapabilityRepository;

import java.util.List;

@Service
public class CapabilityService {

    private CapabilityRepository capabilityRepository;

    public CapabilityService(CapabilityRepository capabilityRepository) {
        this.capabilityRepository = capabilityRepository;
    }

    public List<Capability> getAllCapabilities() {
        return capabilityRepository.findAll();
    }

    public Capability findCapById(Long id) {
        return capabilityRepository.findById(id).orElseThrow(() -> new CapabilityException("Capability with ID: "+id+" Not found"));
    }
}
