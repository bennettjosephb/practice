package au.com.showcase.application.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import au.com.showcase.application.dao.IDProofDao;
import au.com.showcase.application.model.IDProof;
import au.com.showcase.application.util.CustomHibernateDaoSupport;

@Repository("idProofDao")
public class IDProofDaoImpl extends CustomHibernateDaoSupport implements
		IDProofDao {

	@Transactional(propagation = Propagation.MANDATORY)
	public void save(IDProof idProof) {
		getHibernateTemplate().save(idProof);
	}

	public void update(IDProof idProof) {
		getHibernateTemplate().update(idProof);
	}

	public void delete(IDProof idProof) {
		getHibernateTemplate().delete(idProof);
	}

	public IDProof findByStockCode(String stockCode) {
		List list = getHibernateTemplate().find(
				"from idProof where stockCode=?", stockCode);
		return (IDProof) list.get(0);
	}

}