/**
 * jobmanager-core
 * 
 * Criada em 14/03/2011 20:01:46
 * 
 * Direito de cópia reservado à Z Sistemas S.A.
 * Todos os direitos são reservador em propriedade dda empresa
 * ------------- Z Sistemas S.A. --------------
 * O uso deste produto é sujeito aos termos de licença
 */
package org.ps.jobmanager.core;

/**
 * TODO (psales 14/03/2011) - javadoc
 * 
 * @author psales
 * @since 14/03/2011
 */
public class SchedulerManagerException extends RuntimeException {

	/** TODO (psales 14/03/2011) - javadoc */
	private static final long serialVersionUID = 3218427170909740357L;

	/**
	 * TODO (psales 14/03/2011) - javadoc
	 *
	 * @param msg
	 * @param cause
	 */
	public SchedulerManagerException(String msg, Throwable cause) {
		super(msg, cause);
	}
	
}
