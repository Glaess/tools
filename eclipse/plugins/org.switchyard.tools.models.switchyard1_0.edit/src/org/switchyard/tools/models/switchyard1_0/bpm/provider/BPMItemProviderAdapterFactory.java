/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.bpm.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.switchyard.tools.models.switchyard1_0.bpm.util.BPMAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BPMItemProviderAdapterFactory extends BPMAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier();

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<Object>();

    /**
     * This constructs an instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BPMItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType1} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActionType1ItemProvider actionType1ItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.bpm.ActionType1}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createActionType1Adapter() {
        if (actionType1ItemProvider == null) {
            actionType1ItemProvider = new ActionType1ItemProvider(this);
        }

        return actionType1ItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.bpm.AuditType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AuditTypeItemProvider auditTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.bpm.AuditType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createAuditTypeAdapter() {
        if (auditTypeItemProvider == null) {
            auditTypeItemProvider = new AuditTypeItemProvider(this);
        }

        return auditTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BPMImplementationTypeItemProvider bpmImplementationTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createBPMImplementationTypeAdapter() {
        if (bpmImplementationTypeItemProvider == null) {
            bpmImplementationTypeItemProvider = new BPMImplementationTypeItemProvider(this);
        }

        return bpmImplementationTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DocumentRootItemProvider documentRootItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDocumentRootAdapter() {
        if (documentRootItemProvider == null) {
            documentRootItemProvider = new DocumentRootItemProvider(this);
        }

        return documentRootItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.bpm.MappingType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MappingTypeItemProvider mappingTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.bpm.MappingType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createMappingTypeAdapter() {
        if (mappingTypeItemProvider == null) {
            mappingTypeItemProvider = new MappingTypeItemProvider(this);
        }

        return mappingTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.bpm.ParametersType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ParametersTypeItemProvider parametersTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.bpm.ParametersType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createParametersTypeAdapter() {
        if (parametersTypeItemProvider == null) {
            parametersTypeItemProvider = new ParametersTypeItemProvider(this);
        }

        return parametersTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.bpm.ResourceType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ResourceTypeItemProvider resourceTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.bpm.ResourceType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createResourceTypeAdapter() {
        if (resourceTypeItemProvider == null) {
            resourceTypeItemProvider = new ResourceTypeItemProvider(this);
        }

        return resourceTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.bpm.ResultsType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ResultsTypeItemProvider resultsTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.bpm.ResultsType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createResultsTypeAdapter() {
        if (resultsTypeItemProvider == null) {
            resultsTypeItemProvider = new ResultsTypeItemProvider(this);
        }

        return resultsTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.bpm.TaskHandlerType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TaskHandlerTypeItemProvider taskHandlerTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.bpm.TaskHandlerType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createTaskHandlerTypeAdapter() {
        if (taskHandlerTypeItemProvider == null) {
            taskHandlerTypeItemProvider = new TaskHandlerTypeItemProvider(this);
        }

        return taskHandlerTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.bpm.EventListenerType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EventListenerTypeItemProvider eventListenerTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.bpm.EventListenerType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createEventListenerTypeAdapter() {
        if (eventListenerTypeItemProvider == null) {
            eventListenerTypeItemProvider = new EventListenerTypeItemProvider(this);
        }

        return eventListenerTypeItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object type) {
        return supportedTypes.contains(type) || super.isFactoryForType(type);
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter adapt(Notifier notifier, Object type) {
        return super.adapt(notifier, this);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object adapt(Object object, Object type) {
        if (isFactoryForType(type)) {
            Object adapter = super.adapt(object, type);
            if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
                return adapter;
            }
        }

        return null;
    }

    /**
     * This adds a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void addListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void removeListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void fireNotifyChanged(Notification notification) {
        changeNotifier.fireNotifyChanged(notification);

        if (parentAdapterFactory != null) {
            parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

    /**
     * This disposes all of the item providers created by this factory. 
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void dispose() {
        if (actionType1ItemProvider != null) actionType1ItemProvider.dispose();
        if (auditTypeItemProvider != null) auditTypeItemProvider.dispose();
        if (bpmImplementationTypeItemProvider != null) bpmImplementationTypeItemProvider.dispose();
        if (documentRootItemProvider != null) documentRootItemProvider.dispose();
        if (mappingTypeItemProvider != null) mappingTypeItemProvider.dispose();
        if (parametersTypeItemProvider != null) parametersTypeItemProvider.dispose();
        if (resourceTypeItemProvider != null) resourceTypeItemProvider.dispose();
        if (resultsTypeItemProvider != null) resultsTypeItemProvider.dispose();
        if (taskHandlerTypeItemProvider != null) taskHandlerTypeItemProvider.dispose();
        if (eventListenerTypeItemProvider != null) eventListenerTypeItemProvider.dispose();
    }

}
