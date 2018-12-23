package iftm.filipe.com.iftransparenciav2.di.builder

import android.arch.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import iftm.filipe.com.iftransparenciav2.di.ViewModelKey
import iftm.filipe.com.iftransparenciav2.ui.viewmodel.DetalhesAuxilioViewModel
import iftm.filipe.com.iftransparenciav2.ui.viewmodel.MainViewModel

@Module
abstract class ViewModelBuilder {

    //ViewModel Factory
    /* @Binds
     abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
 */
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(mainViewModel: MainViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(DetalhesAuxilioViewModel::class)
    abstract fun bindDetalhesAuxilioViewModel(detalhesAuxilioViewModel: DetalhesAuxilioViewModel): ViewModel
}