package com.nttdata.transaction.infraestructure.repository;

import com.nttdata.transaction.application.AccountAffiliationRepository;
import com.nttdata.transaction.domain.AccountAffiliation;
import com.nttdata.transaction.domain.bean.Customer;
import com.nttdata.transaction.infraestructure.client.CustomerClient;
import com.nttdata.transaction.infraestructure.model.dao.AccountAffiliationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * ACCOUNTAFFILIATIONCRUDREPOSITORY: Implementa las operaciones (CRUD) de la afiliación de cuentas bancarias
 */
@Component
public class AccountAffiliationCrudRepository implements AccountAffiliationRepository {
    @Autowired
    IAccountAffiliationCrudRepository repository;

    @Autowired
    CustomerClient customerClient;
    /*
    create: Regitra las afiliaciones de cuentas bancarias de un cliente
     */
    @Override
    public Mono<AccountAffiliation> create(AccountAffiliation accountAffiliation) {
        return repository.save(mapAccountAffiliationToAccountAffiliationDao(accountAffiliation))
                .map(this::mapAccountAffiliationDaoToAccountAffiliation);
    }
    /*
    update: Actualiza las afiliaciones de cuentas bancarias de un cliente
     */
    @Override
    public Mono<AccountAffiliation> update(String id, AccountAffiliation accountAffiliation) {
        return repository.findById(id)
                .flatMap( p ->create(mapAccountAffiliationDaoToAccountAffiliation(p,accountAffiliation)));
    }
    /*
    delete: Elimina los datos de la afiliacion de cuentas bancarias de un cliente
     */
    @Override
    public Mono<AccountAffiliationDao> delete(String id) {
        return repository.findById(id)
                .flatMap(p -> repository.deleteById(p.getId()).thenReturn(p));
    }
    /*
    findById: Busca por el Id los datos de la afiliacion de cuentas bancarias de un cliente
     */
    @Override
    public Mono<AccountAffiliation> findById(String id) {
        return repository.findById( (id))
                .map( this::mapAccountAffiliationDaoToAccountAffiliation);
    }
    /*
    findAll: Busca  los datos de todas las afiliaciones de cuentas bancarias de un cliente
     */
    @Override
    public Flux<AccountAffiliation> findAll() {
        return repository.findAll()
                .map(this::mapAccountAffiliationDaoToAccountAffiliation);
    }
    /*
    mapAccountAffiliationToAccountAffiliationDao: Crea un clase AccountAffiliation y
                                                  asigna los datos de AccountAffiliationDao
     */
    private AccountAffiliationDao mapAccountAffiliationToAccountAffiliationDao(AccountAffiliation accountAffiliation){
        AccountAffiliationDao accountAffiliationDao = new AccountAffiliationDao();
        accountAffiliationDao.setAccount(accountAffiliation.getAccount());
        accountAffiliationDao.setBalance(accountAffiliation.getBalance());
        accountAffiliationDao.setBaseAmount(accountAffiliation.getBaseAmount());
        accountAffiliationDao.setCustomer(accountAffiliation.getCustomer());
        accountAffiliationDao.setId(accountAffiliation.getId());
        accountAffiliationDao.setStatus(accountAffiliation.getStatus());
        accountAffiliationDao.setNumber(accountAffiliation.getNumber());
        accountAffiliationDao.setMovementDay(accountAffiliation.getMovementDay());
        accountAffiliationDao.setNumberOfHolder(accountAffiliation.getNumberOfHolder());
        accountAffiliationDao.setNumberOfSigner(accountAffiliation.getNumberOfSigner());
        accountAffiliationDao.setIdAccount(accountAffiliation.getIdAccount());
        accountAffiliationDao.setIdCustomer(accountAffiliation.getIdCustomer());
        return accountAffiliationDao;
    }
    /*
    mapAccountAffiliationDaoToAccountAffiliation: Crea un clase AccountAffiliation y
                                                  asigna los datos de AccountAffiliationDao
     */
    private AccountAffiliation mapAccountAffiliationDaoToAccountAffiliation(AccountAffiliationDao accountAffiliationDao){
        AccountAffiliation accountAffiliation = new AccountAffiliation();
        System.out.println("[mapAccountAffiliationDaoToAccountAffiliation] accountAffiliationDao.getIdCustomer():"+accountAffiliationDao.getIdCustomer());
        System.out.println("[mapAccountAffiliationDaoToAccountAffiliation] accountAffiliationDao.getId():"+accountAffiliationDao.getId());
        //Mono<Customer> c = customerClient.getById(accountAffiliationDao.getIdCustomer());
        Mono<Customer> c = customerClient.getById("619b24ee75c5de6a11afaf5a");
        System.out.println("c:"+c);
        accountAffiliation.setCustomer(c.block());
        System.out.println("setCustomer OK");
        accountAffiliation.setAccount(accountAffiliationDao.getAccount());
        accountAffiliation.setBalance(accountAffiliationDao.getBalance());
        accountAffiliation.setBaseAmount(accountAffiliationDao.getBaseAmount());

        accountAffiliation.setId(accountAffiliationDao.getId());
        accountAffiliation.setStatus(accountAffiliationDao.getStatus());
        accountAffiliation.setNumber(accountAffiliationDao.getNumber());
        accountAffiliation.setMovementDay(accountAffiliationDao.getMovementDay());
        accountAffiliation.setNumberOfHolder(accountAffiliationDao.getNumberOfHolder());
        accountAffiliation.setNumberOfSigner(accountAffiliationDao.getNumberOfSigner());
        accountAffiliation.setIdAccount(accountAffiliationDao.getIdAccount());
        accountAffiliation.setIdCustomer(accountAffiliationDao.getIdCustomer());
        return accountAffiliation;
    }

    /*
   mapAccountAffiliationDaoToAccountAffiliation: Asigna el Id de AccountAffiliationDao a AccountAffiliation
   */
    private AccountAffiliation mapAccountAffiliationDaoToAccountAffiliation (AccountAffiliationDao accountAffiliationDao,  AccountAffiliation accountAffiliation){
        accountAffiliation.setId(accountAffiliationDao.getId());
        return accountAffiliation;
    }
}
