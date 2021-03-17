import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TabContattiComponent } from './tab-contatti.component';

describe('TabContattiComponent', () => {
  let component: TabContattiComponent;
  let fixture: ComponentFixture<TabContattiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TabContattiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TabContattiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
